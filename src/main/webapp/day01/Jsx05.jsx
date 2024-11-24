// age는 상수로 나이를 설정
// 19세 이하라면 "입장 불가"
// 성인이라면 "입장 가능 "
// age가 짝수 라면 " 당첨"
// 짝수가 아니라면 "꽝"을 화면에 출력

// if 문을 쓰지 않고 연산자로 출력하기 실습
import React from 'react';

const Jsx05 = () => {
    const age = 13;
    const [pass, notPass, lucky, unLucky ] = ["입장 가능" , "입장 불가" , "당첨" , "꽝"]

    // 조건식을 변수에 담음
    const isAdult = age >= 19;
    const isEven = age % 2 === 0;

    // 컴포넌트를 제작
    const passComponent = (<div>{pass}</div>)
    const notPassComponet = (<div>{notPass}</div>)
    const luckyComponent = (<div>{lucky}</div>)
    const unLuckyComponent = (<div>{unLucky}</div>)

    // 삼항연산자
    const enter = isAdult ? passComponent : notPassComponet;
    const win = isEven ? luckyComponent : unLuckyComponent;

    return (
        <div>
            당신의 나이는 {age} 입니다.
            {enter}
            {win}
        </div>
    );
};

export default Jsx05;