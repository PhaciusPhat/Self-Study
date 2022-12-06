import axios from "axios";
import { compose } from "redux";

export const callAPI = async () => {
  return await axios.get("https://free-nba.p.rapidapi.com/players", {
    params: { page: "0", per_page: "25" },
    headers: {
      "X-RapidAPI-Key": "63ad305d07msh4f2b44c4f99b1d0p180a8djsna969b2728549",
      "X-RapidAPI-Host": "free-nba.p.rapidapi.com",
    },
  });
};

export const composeEnhancers = window.__REDUX_DEVTOOLS_EXTENSION_COMPOSE__ || compose;
