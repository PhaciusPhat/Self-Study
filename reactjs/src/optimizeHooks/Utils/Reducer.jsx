import { DOWN, UP } from "./Constance";
export const reducer = (state, action) => {
  console.log("dispatch", action);
  switch (action) {
    case UP:
      state.number++;
      return {...state};
    case DOWN:
      state.number--;
      return { ...state };
    default:
      return { ...state };
  }
};
