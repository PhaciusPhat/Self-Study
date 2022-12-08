import React, { useState } from "react";
import { withErrorBoundary } from "react-error-boundary";

function ErrorBoundaryWithPackage() {
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

const CustomErrorBoundary = () => {
  return (
    <>
      <h1 style={{ color: "red" }}>This component has some error</h1>
    </>
  );
};

export default withErrorBoundary(ErrorBoundaryWithPackage, {
  FallbackComponent: CustomErrorBoundary,
});
