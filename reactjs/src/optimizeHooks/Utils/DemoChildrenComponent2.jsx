import React, { useContext } from "react";
import { MyContext } from "./MyContext";

function DemoChildrenComponent2() {
  const value = useContext(MyContext);
  console.log(value);
  return <div>DemoChildrenComponent2</div>;
}

export default DemoChildrenComponent2;
