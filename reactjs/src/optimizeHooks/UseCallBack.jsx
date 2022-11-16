import React, { useCallback, useState } from "react";
import DemoComponent from "./Utils/DemoComponent";


function UseCallBack() {
  const [number, setNumber] = useState(0);
  const increaseNumber = useCallback(() => {
    setNumber(number => number + 1);
  }, []);

  return (
    <>
      <div>{number}</div>
      <DemoComponent increaseNumber={increaseNumber} />
    </>
  );
}

export default UseCallBack;
