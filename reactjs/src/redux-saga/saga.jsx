import { all, call, put, takeLatest } from "redux-saga/effects";
import { Call_List, Call_Success } from "./reducer";
import { callAPI } from "./../utils/ultils";
export function* test_dispatcher() {
  yield console.log("every");
}

export function* dispatch_saga(action) {
  try {
    const res = yield call(callAPI);
    yield put(Call_Success(res.data));
  } catch (error) {
    console.log(error);
  }
}

export function* first_saga() {
  console.log("first saga");
  yield takeLatest(Call_List.toString(), dispatch_saga);
  // yield takeEvery(Call_List.toString(), test_dispatcher);
}
export function* second_saga() {
  yield console.log("second saga");
}

export default function* rootSaga() {
  console.log("run root saga");
  yield all([first_saga(), second_saga()]);
}
