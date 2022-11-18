import React, { useContext } from "react";
import { MyContext } from "./MyContext";

function DemoChildrenComponent() {
  const [state, dispatch] = useContext(MyContext);
  console.log(state);
  return (
    <>
      <div>DemoChildrenComponent</div>
      <button onClick={() => {dispatch("UP")}}>up</button>
      <button onClick={() => {dispatch("DOWN")}}>down</button>
    </>
  );
}

export default DemoChildrenComponent;
