import React, { memo } from "react";

function DemoComponent(props) {
  const { increaseNumber } = props;
  // console.log("Demo Component Run");
  return <button onClick={increaseNumber}>Click</button>;
}
export default memo(DemoComponent);
