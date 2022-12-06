import React from "react";
import useMyHook from "./CustomHook";

function CustomHook() {
  const timeHook = useMyHook();
  return <h1>{timeHook.time}</h1>;
}

export default CustomHook;
