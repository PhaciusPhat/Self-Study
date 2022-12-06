import React from "react";
import { store } from "./store";
import { decrease, increase } from './action';
import { useSelector } from 'react-redux';
import { useDispatch } from 'react-redux';
import { Provider } from 'react-redux';

function ReduxToolkit() {
  return (
    <Provider store={store}>
      ReduxToolkit
      <br />
      <RenderState />
      <br />
      <button
        onClick={() => {
          store.dispatch(increase(1));
        }}
      >
        +
      </button>
      <button
        onClick={() => {
          store.dispatch(decrease(1));
        }}
      >
        -
      </button>
      <TestDispatcher/>
    </Provider>
  );
}


function RenderState() {
    const number = useSelector((state) => state.number);
    return <>{number}</>;
  }
  
  function TestDispatcher() {
    const dispatch = useDispatch();
  
    return <>
      <button onClick={() => dispatch(increase(10))}>increase 10</button>
    </>;
  }

export default ReduxToolkit;
