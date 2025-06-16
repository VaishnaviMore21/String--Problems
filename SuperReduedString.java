  public String superReducedStringUsingStacks(String str) {

    Stack<Character> characterStack = new Stack<>();

    for (int i = 0; i < str.length(); i++) {
      char x = str.charAt(i);

      if (characterStack.isEmpty())
        characterStack.push(x);
      else if (x == characterStack.peek())
        characterStack.pop();
      else
        characterStack.push(x);
    }

    StringBuilder resultBuilder = new StringBuilder();
    for (Character character : characterStack)
      resultBuilder.append(character);

    return resultBuilder.length() == 0 ?
        "Empty String" : resultBuilder.toString();
  }
