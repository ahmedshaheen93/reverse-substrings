package com.shaheen;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseSubStringTest {
  ReverseSubString reverseSubString = new ReverseSubString();

  @Test
  void onlyOneSubString() {
    assertThat(reverseSubString.reverse("abd(jnb)asdf")).isEqualTo("abd(bnj)asdf");
  }

  @Test
  void noSubString() {
    assertThat(reverseSubString.reverse("abdjnbasdf")).isEqualTo("abdjnbasdf");
  }

  @Test
  void multiSubString() {
    assertThat(reverseSubString.reverse("dd(df)a(ghhh)")).isEqualTo("dd(fd)a(hhhg)");
  }
}
