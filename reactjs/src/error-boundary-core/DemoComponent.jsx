import React, { useState } from "react";

function DemoComponent() {
  const [number, setNumber] = useState(0);
  const [pageError, setPageError] = useState(false);

  if (pageError) {
    throw new Error("There has some errors here!");
  }

  const btnClick = () => {
    if (number < 4) setNumber((number) => number + 1);
    else setPageError(true);
  };

  return (
    <>
      <div>{number}</div>
      <button onClick={btnClick}>click</button>
    </>
  );
}

export default DemoComponent;
