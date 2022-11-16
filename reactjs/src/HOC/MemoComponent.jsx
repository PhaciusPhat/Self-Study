import React, { memo } from "react";

function MemoComponent() {
  console.log("HOC");
  return (
    <>
      <div>This is component test for using memo HOC</div>
    </>
  );
}

export default memo(MemoComponent);
