/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.extensions.auto.annotations;

import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.Span.Kind;

/**
 * This class is not a classical test. It's just a demonstration of possible usages of {@link
 * WithSpan} annotation together with some explanations. The goal of this class is to serve as an
 * early detection system for inconvenient API and unintended API breakage.
 */
@SuppressWarnings("unused")
public class WithSpanUsageExamples {

  /**
   * A new {@link Span} will be created for this method's execution. The span's name will be
   * automatically generated by OpenTelemetry auto-instrumentation, probably as
   * "WithSpanUsageExamples.method1".
   */
  @WithSpan
  public void method1() {}

  /** Name of the generated span will be "shinyName". */
  @WithSpan("shinyName")
  public void method2() {}

  /**
   * A {@link Span} with the default name, and a {@link Kind} of {@link Kind#CONSUMER} will be
   * created for this method.
   */
  @WithSpan(kind = Kind.CONSUMER)
  public void consume() {}
}