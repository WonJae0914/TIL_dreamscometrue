// 콜백함수 예제 - 비동기적인 작업

// 비동기 함수
function fetchData(callback) {
    console.log("1번")
    setTimeout(() => {
      const data = "Hello, World!";
      callback(null, data); // 에러는 null로 전달하고, 데이터는 두 번째 인자로 전달함
    }, 1000); // 1초 후에 데이터를 가져옴
  }
  
  // 콜백 함수
  function handleData(error, data) {
    console.log("2번")
    if (error) {
      console.error("Error occurred:", error);
    } else {
      console.log("Data received:", data);
    }
  }
  
  // fetchData 함수 호출 시 콜백 함수를 전달하여 비동기 작업 처리
  fetchData(handleData);