import React, { useMemo, useState } from "react";

function UseMemo() {
  const [numbers, setNumbers] = useState([0]);
  const [number, setNumber] = useState(0);

//   console.log("re-render");

  let total = useMemo(() => {
    return numbers.reduce((rs, i) => {
    //   console.log("calculate total");
      return (rs += i);
    }, 0);
  }, [numbers]);

  const inputChange = (e) => {
    setNumber(+e.target.value);
  };

  const addToArray = () => {
    let tempArr = [...numbers];
    tempArr.push(number);
    setNumbers(tempArr);
  };

  const onSubmit = (e) => {
    e.preventDefault();
  };

  return (
    <>
      <form onSubmit={onSubmit}>
        <input type="number" onChange={inputChange} />
        <button onClick={addToArray}>add to array</button>
        <div>Array's total: {total}</div>
      </form>
    </>
  );
}

export default UseMemo;
