import { createReducer } from "@reduxjs/toolkit";

const reducer = createReducer(
  { number: 0 },
  {
    increment: (state, action) => {
      state.number += action.payload;
      return state;
    },
    decrement: (state, action) => {
      state.number -= action.payload;
      return state;
    },
  }
);

export default reducer;
