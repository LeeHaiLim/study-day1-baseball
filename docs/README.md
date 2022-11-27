# 미션 - 숫자야구게임

## 🚀 기능 요구 사항

기본적으로 1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 맞추는 게임이다.

- 같은 수가 같은 자리에 있으면 스트라이크, 다른 자리에 있으면 볼, 같은 수가 전혀 없으면 낫싱이란 힌트를 얻고, 그 힌트를 이용해서 먼저 상대방(컴퓨터)의 수를 맞추면 승리한다.
    - 예) 상대방(컴퓨터)의 수가 425일 때
        - 123을 제시한 경우 : 1스트라이크
        - 456을 제시한 경우 : 1볼 1스트라이크
        - 789를 제시한 경우 : 낫싱
- 위 숫자 야구 게임에서 상대방의 역할을 컴퓨터가 한다. 컴퓨터는 1에서 9까지 서로 다른 임의의 수 3개를 선택한다. 게임 플레이어는 컴퓨터가 생각하고 있는 서로 다른 3개의 숫자를 입력하고, 컴퓨터는 입력한 숫자에 대한
  결과를 출력한다.
- 이 같은 과정을 반복해 컴퓨터가 선택한 3개의 숫자를 모두 맞히면 게임이 종료된다.
- 게임을 종료한 후 게임을 다시 시작하거나 완전히 종료할 수 있다.
- 사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException`을 발생시킨 후 애플리케이션은 종료되어야 한다.


### 구현할 기능 목록
- [x] 사용자에게 3자리 숫자를 입력받는다 `InputView - readNumbers()` 
  - [x] 숫자가 아닐 경우 예외가 발생한다. `InputView - validIsDigit()`
  - [x] 중복된 숫자가 있다면 예외가 발생한다. `Player - validDuplicateNumber()`
  - [x] 1~9사이의 숫자가 아닐 경우 예외가 발생한다. `Player - validNumberRange()`
  - [x] 세 자리 숫자가 아닐 경우 예외가 발생한다. `Player - validIsThreeNumber()`
  - [x] 사용자에게 입력 받은 숫자를 저장한다. `Player - savePlayerNumber()`
- [x] 컴퓨터는 1~9사이의 중복되지 않은 랜덤 수 3자리를 생성한다. `GameController - generageThreeNumber()`
- [x] 컴퓨터가 생성한 숫자와 사용자가 입력한 숫자를 비교한다. `Computer-compareResult()`
  - [x] 비교 결과를 생성한다. `Result - getResult()`
  - [x] 비교 결과를 저장한다. `Counting - saveResult()`
- [x] 결과를 출력한다. `OutputView - printResult()`
  - [x] 입력한 수에 대한 결과를 볼, 스트라이크 개수로 표시한다. 
  - [x] 하나도 없는 경우는 `낫싱`으로 표시한다.
  - [x] 3개의 숫자를 모두 맞힐 경우 `3스트라이크`로 표시한다. 
- [x] 3개의 숫자를 모두 맞히면 게임은 종료된다. `Counting - isFinish()`
- [x] 게임 종료 문구를 출력한다. `OutputView - printFinishMessage()`

- [x] 재시작/종료를 구분하는 1과 2를 입력받는다. `InputView - readGameCommand()`
- [x] 1과 2가 아닐 경우 예외가 발생한다. `Command - validCommand()`