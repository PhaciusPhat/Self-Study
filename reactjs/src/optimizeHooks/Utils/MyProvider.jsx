import React, { useReducer } from "react";
import { initialState } from "./InitialState";
import { MyContext } from "./MyContext";
import { reducer } from "./Reducer";

function MyProvider({ children }) {
  const [state, dispatch] = useReducer(reducer, initialState);
  return <MyContext.Provider value={[state, dispatch]}>{children}</MyContext.Provider>;
}

export default MyProvider;
