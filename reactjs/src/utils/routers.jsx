import HighOrderComponent from "../HOC/HighOrderComponent";
import LifeCycleWithClass from "../lifecycleWithClass/LifeCycleWithClass";
import LifeCycleWithFunc from "../lifecycleWithFunc/LifeCycleWithFunc";
import OptimizeHooks from "../optimizeHooks/OptimizeHooks";

export const routers = [
  { path: "", element: <h1>React</h1> },
  { path: "/life-cycle-with-class", element: <LifeCycleWithClass /> },
  { path: "/life-cycle-with-function", element: <LifeCycleWithFunc /> },
  { path: "/high-order-component", element: <HighOrderComponent /> },
  { path: "/optimize-hooks", element: <OptimizeHooks /> },
];
