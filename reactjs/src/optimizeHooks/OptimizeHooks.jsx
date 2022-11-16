import React from "react";
import UseCallBack from "./UseCallBack";
import UseRef from "./UseRef";
import UseMemo from './UseMemo';
import UseReducer from './UseReducer';

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
    </>
  );
}

export default OptimizeHooks;
