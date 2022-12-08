import React from 'react'
import DemoComponent from './DemoComponent'
import ErrorBoundaries from './ErrorBoundaries'

function ErrorBoundariesCore() {
  return (
    <ErrorBoundaries>
        <DemoComponent/>
    </ErrorBoundaries>
  )
}

export default ErrorBoundariesCore