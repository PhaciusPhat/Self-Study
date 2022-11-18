import React from "react";
import UseCallBack from "./UseCallBack";
import UseRef from "./UseRef";
import UseMemo from './UseMemo';
import UseReducer from './UseReducer';
import UseContext from "./UseContext";
import UseContextWithUseReducer from './UseContextWithUseReducer';

function OptimizeHooks() {
  return (
    <>
      <div>useRef</div>
      <UseRef />
      <hr />
      <div>useCallback</div>
      <UseCallBack />
      <hr />
      <div>useMemo</div>
      <UseMemo/>
      <hr />
      <div>useReducer</div>
      <UseReducer/>
      <hr />
      <div>useContext</div>
      <UseContext/>
      <hr />
      <div>useContext with useReducer</div>
      <UseContextWithUseReducer/>
    </>
  );
}

export default OptimizeHooks;
