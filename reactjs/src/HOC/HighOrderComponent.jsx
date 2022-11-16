import React from 'react'
import MemoComponent from "./MemoComponent";
import { useState } from 'react';
import CustomComponent from './CustomComponent';
import SimpleComponent from './SimpleComponent';

function HighOrderComponent() {
  
  const [number, setNumber] = useState(0);

  const btnClick = () => {
    setNumber(number + 1);
  };

  return (
    <>
      <MemoComponent/>
      {CustomComponent("CSGO")(<SimpleComponent/>)}
      <div>{number}</div>
      <button onClick={btnClick}>click</button>
    </>
  );
}

export default HighOrderComponent
