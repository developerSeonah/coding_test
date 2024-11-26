import React, {useState} from 'react';

const Sount = () => {
    const [sound, setSound] = useState("");

    const dogButton = () => {
        setSound("멍멍 오늘 화요일 화난다!!")
    }
    const catButton = () => {
        setSound("고양이는 야옹!")
    }
    return  (
        <div>
            <p>{sound}</p>
            <button onClick={dogButton}>강아지 버튼</button>
            <button onClick={catButton}>고양이 버튼</button>
        </div>
    );
};

export default Sound;