/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   native.c                                           :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: Antoine Massias <massias.antoine.pro@gm    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2024/08/10 16:04:14 by Antoine Mas       #+#    #+#             */
/*   Updated: 2024/08/10 19:57:33 by Antoine Mas      ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include <jni.h>
#include <stdio.h>
#include <unistd.h>

#include "org_tr0nscendence_clipong_TerminalManager.h"

JNIEXPORT
jboolean
JNICALL
Java_org_tr0nscendence_clipong_TerminalManager_isatty(
	JNIEnv *,
	jobject
	)
{
	return (isatty(STDOUT_FILENO));
}
