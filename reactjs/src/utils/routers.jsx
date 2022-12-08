import ReduxSaga from "../redux-saga";
import CustomHook from "../CustomHook";
import HighOrderComponent from "../HOC/HighOrderComponent";
import LifeCycleWithClass from "../lifecycleWithClass/LifeCycleWithClass";
import LifeCycleWithFunc from "../lifecycleWithFunc/LifeCycleWithFunc";
import OptimizeHooks from "../optimizeHooks/OptimizeHooks";
import ReduxCore from "../redux-core";
import ReduxThunk from "../redux-thunk";
import ReduxToolkit from "./../redux-toolkit";
import ErrorBoundariesCore from "../error-boundary-core/index.jsx";
import ErrorBoundaryWithPackageNPM from './../error-boundary-with-package/index';

export const routers = [
  { path: "", element: <h1>React</h1> },
  { path: "/life-cycle-with-class", element: <LifeCycleWithClass /> },
  { path: "/life-cycle-with-function", element: <LifeCycleWithFunc /> },
  { path: "/high-order-component", element: <HighOrderComponent /> },
  { path: "/optimize-hooks", element: <OptimizeHooks /> },
  { path: "/redux-core", element: <ReduxCore /> },
  { path: "/redux-toolkit", element: <ReduxToolkit /> },
  { path: "/custom-hook", element: <CustomHook /> },
  { path: "/redux-thunk", element: <ReduxThunk /> },
  { path: "/redux-saga", element: <ReduxSaga /> },
  { path: "/error-boundary-core", element: <ErrorBoundariesCore /> },
  { path: "/error-boundary-package", element: <ErrorBoundaryWithPackageNPM /> },
];
