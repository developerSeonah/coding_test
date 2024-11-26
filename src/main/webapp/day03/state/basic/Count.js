import React,{useState} from 'react';

const Count = () => {
    const [number, SetNumber] = useSatate(0)
    const increase = () => {
        setNumber(number + 1)
    }
    const decrease = () => {
        setNumber(number - 1)
    }

    return  (
        <div>
            <button onCilck={decrease}>감소</button>
            {number}
            <button onCilck={increase}>증가</button>
        </div>
    );
};

export default Count;