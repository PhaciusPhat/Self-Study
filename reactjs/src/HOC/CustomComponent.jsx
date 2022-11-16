import React from 'react'

const CustomComponent = (paramText) => (DemoComponent) => {
  return (
    <>
        <h1>{paramText}</h1>
        {DemoComponent}
    </>
  )
}

export default CustomComponent