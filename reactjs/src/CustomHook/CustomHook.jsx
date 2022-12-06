import { useEffect, useState } from "react";

function useMyHook() {
  const [time, setTime] = useState();

  useEffect(() => {
    const timeInterval = setInterval(() => {
      const now = new Date();
      const date = now.toISOString().split("T")[0];
      const time = now.toTimeString().split(" ")[0];
      setTime(`${date} ${time}`);
    }, 1000);
    return () => {
      clearInterval(timeInterval);
    };
  }, []);

  return { time };
}

export default useMyHook;
