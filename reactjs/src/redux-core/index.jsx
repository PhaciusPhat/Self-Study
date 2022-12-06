import React from "react";
import { Provider, useSelector, useDispatch } from "react-redux";
import { increaseNumber, decreaseNumber } from "./action";
import { store } from "./store";
function ReduxCore() {
  return (
    <Provider store={store}>
      Redux Core
      <br />
      <RenderState />
      <br />
      <button
        onClick={() => {
          store.dispatch(increaseNumber());
        }}
      >
        +
      </button>
      <button
        onClick={() => {
          store.dispatch(decreaseNumber());
        }}
      >
        -
      </button>
      <TestDispatcher/>
    </Provider>
  );
}

function RenderState() {
  const number = useSelector((state) => state.number);
  return <>{number}</>;
}

function TestDispatcher() {
  const dispatch = useDispatch();

  return <>
    <button onClick={() => dispatch(increaseNumber())}>demoDispatch</button>
  </>;
}

export default ReduxCore;
