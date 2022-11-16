import React, { useReducer } from "react";
import { DOWN, UP } from "./Utils/Constance";
import { initialState } from "./Utils/InitialState";
import { reducer } from "./Utils/Reducer";

function UseReducer() {
  const [state, dispatch] = useReducer(reducer, initialState);

  const btnClick = (isUp) => {
    dispatch(isUp ? UP : DOWN);
  };

  return (
    <>
      <div>{state.number}</div>
      <button onClick={() => btnClick(true)}>up</button>
      <button onClick={() => btnClick(false)}>down</button>
    </>
  );
}

export default UseReducer;
