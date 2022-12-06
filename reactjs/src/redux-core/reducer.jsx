const initialState = {
  number: 0,
};

const reducer = (state = initialState, { type }) => {
  switch (type) {
    case "increase":
      state.number += 1;
      return { ...state };
    case "decrease":
      state.number -= 1;
      return { ...state };
    default:
      return state;
  }
};
export default reducer;
