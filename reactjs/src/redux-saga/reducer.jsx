import { createSlice } from "@reduxjs/toolkit";

const initialState = {};

const reducer = createSlice({
  name: "root",
  initialState,
  reducers: {
    Call_List: (state) => {
      return state;
    },
    Call_Success: (state, action) => {
      state = action.payload;
      return state;
    },
  },
});

export const { Call_List, Call_Success } = reducer.actions;

export default reducer;
