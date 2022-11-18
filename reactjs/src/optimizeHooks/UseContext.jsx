import React from "react";
import DemoChildrenComponent2 from "./Utils/DemoChildrenComponent2";
import { MyContext } from "./Utils/MyContext";

function UseContext() {
  return (
    <>
      <MyContext.Provider value={{ text: "value", number: 1 }}>
        <DemoChildrenComponent2 />
      </MyContext.Provider>
    </>
  );
}

export default UseContext;
