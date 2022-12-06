import { applyMiddleware, createStore } from "redux";
import thunk from "redux-thunk";
import { composeEnhancers } from "../utils/ultils";
import reducer from "./reducer";

export const store = createStore(
  reducer,
  composeEnhancers(applyMiddleware(thunk))
);
