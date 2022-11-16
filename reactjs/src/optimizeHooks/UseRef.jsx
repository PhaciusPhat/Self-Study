import React, { useRef, useState } from "react";

function UseRef() {
  const [time, setTime] = useState(60);

  let intervalId = useRef({
    current: 0
  });

  const startBtn = () => {
    intervalId.current = setInterval(() => {
      setTime((time) => time - 1);
    }, 1000);
  };

  const stopBtn = () => {
    clearInterval(intervalId.current);
  };

  return (
    <>
      <div>{time}</div>
      <button onClick={startBtn}>Start</button>
      <button onClick={stopBtn}>Stop</button>
    </>
  );
}

export default UseRef;
