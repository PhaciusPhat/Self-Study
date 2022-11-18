import React from "react";
import DemoChildrenComponent from "./Utils/DemoChildrenComponent ";
import MyProvider from "./Utils/MyProvider";

function UseContextWithUseReducer() {
  return (
    <>
      <MyProvider>
        <DemoChildrenComponent />
      </MyProvider>
    </>
  );
}

export default UseContextWithUseReducer;
