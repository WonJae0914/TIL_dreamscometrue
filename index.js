// const express = require('express') // require : 모듈 불러오기
// const app = express()

// app.get('/', function (req, res) {
//   res.send('Hello World')
// })

// app.listen(3000)// 로컬호스트 번호 

// const express = require('express')
// const app = express()
// const port = 3000

// // get : http 메소드 , / :라우팅 , () =>{} : 콜백함수 
// // http메소드 : 요청의 목적, 종류를 알려주려는 수단 : get 방식으로 요청 
// // get은 주소창에서 넘기는 방식 post은 내부적으로 body에 정보를 적어서 넘기는 방식
// // 라우팅 : 포트로 들어갔더라도 파일이 다양하기 때문에 라우팅으로 구분
// // 콜백함수 : 함수(파라미터) 함수는 보통 이런 구조인데 함수(끝나고 실행할 함수)를 의미한다. 
// // ex) setTimerout 
// app.get('/', (req, res) => { // http메소드 중에 get메소드로 들어온 것들 받겠다라는 의미 
//   res.send('Hello World!') // app.get함수를 실행하고 (req.res) => {res.send('hello world')}를 실행해라! 
// })
// //req : 요청 정보가 담겨있음
// //res : 응답 정보가 담겨있음

// app.listen(port, () => {// port : 들어올 수 있는 입구 (usb포트와 같이 서버가 들어올 수 있는 입구) 
//                         // 포트에 대해 listen하고 있다. 
//   console.log(`Example app listening on port ${port}`) // 기능적인 것 없음. 메세지 띄운 것임.
// })

// 예제
// get / dog => {'sound' : '멍멍'}
// get / cat => {'sound' : '야옹'} 제이슨 데이터

const express = require('express') //불러오기 
var cors = require('cors')
const app = express()
const port = 3000

app.use(cors()) //()안에 요청조건을 작성할 수 있다. 어디서 들어오는 것은 허가, 불허 등. 없으면 모두 허가

app.get('/', (req, res) => {
  res.send('Hello World!') 
})
// app.get('/dog', (req, res) => {
//   res.send({'sound':'멍멍'}) 
// })
// app.get('/cat', (req, res) => {
//   res.json({'sound':'야옹'}) // res.send 나 res.json이나 같음. 그러나 json파일을 전송할 때는 json을 사용하는 것이 더 명시적이다.
// })

app.listen(port, () => {
})

//변수로 줄 수 없는가? 
//GET : params, query 
//GET 방식으로 어떤 정보를 담아서 보낼 때는 파라미터와 쿼리를 이용하는 방법이 있다. 
//유튜버 주소를 /dog, /cat처럼 하나씩 다 주려면 코드가 말도 안되게 길어진다. 
//그렇기 때문에 변수로 주어서 전송하는 방식이 파라미터를 사용하는 방식이다.
//id에 따라 화면을 다르게 보여주면 된다. 
// app.get('/user/:id', (req, res) => { // id를 받을 때는 :(콜론)을 적어주고 그 뒤에 파라미터명(변수명)을 써준다.
//     // const q = req.params // :변수명 => parmas로 들어옴. 
//     // console.log(q.id)
//     const q = req.query // ?q=wonjae&name=jo&age=34
//     console.log(q); 
//     res.json({'유저i이름 :' : q.name})
//   })


//   // POST : parmas , body
//   app.use(express.json());
//   app.get('/user/:id', (req, res) => {
//     const p = req.params 
//     console.log(p);
//     const b = req.body; 
//     console.log(b);
//     res.json({'message :' : 'hello world'})
//   })

  // get / sound/:name 동물소리 api

  app.get('/sound/:name', (req, res) => {
    const {name} = req.params
    if(name=="dog"){
        res.send({'sound':'멍멍'}) 
    }
    else if(name=="cat"){
        res.send({'sound':'야옹'}) 
    }
    else if(name=="pig"){
        res.send({'sound':'꿀꿀'}) 
    }
    else{
        res.send({'sound':'알수없음'}) 
    }

  })
