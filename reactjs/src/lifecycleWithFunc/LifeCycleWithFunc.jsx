import React, { useEffect, useLayoutEffect, useState } from "react";

function LifeCycleWithFunc() {
  const [number, setNumber] = useState(0);

  useEffect(() => {
    console.log("non useEffect");
    return () => {
        console.log("non useEffect unmount or update")
    }
  });

  useEffect(() => {
    console.log("non dependencies useEffect");
    return () => {
        console.log("non dependencies useEffect unmount or update")
    }
  }, []);

  useEffect(() => {
    console.log("dependencies useEffect");
    return () => {
        console.log("dependencies useEffect unmount or update")
    }
  }, [number]);

  const btnClick = () => {
    setNumber(number+1);
  };

  return (
    <>
      <div>{number}</div>
      <button onClick={btnClick}>click</button>
    </>
  );
}

export default LifeCycleWithFunc;
