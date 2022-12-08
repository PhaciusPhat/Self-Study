import React from "react";
import ReactDOM from 'react-dom';

function MyModal({ children }) {
  return ReactDOM.createPortal(
    <div id="my_id">{children}</div>,
    document.querySelector("body")
  );
}

export default MyModal;
