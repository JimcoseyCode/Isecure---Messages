.class final Lexpo/modules/ReactActivityDelegateWrapper$onCreate$2;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/ReactActivityDelegateWrapper;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/l;",
        "Lkotlin/jvm/functions/Function2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LR8/N;",
        "Li7/B;",
        "<anonymous>",
        "(LR8/N;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.ReactActivityDelegateWrapper$onCreate$2"
    f = "ReactActivityDelegateWrapper.kt"
    l = {
        0x91,
        0xa4
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lexpo/modules/ReactActivityDelegateWrapper;


# direct methods
.method constructor <init>(Lexpo/modules/ReactActivityDelegateWrapper;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/ReactActivityDelegateWrapper;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/ReactActivityDelegateWrapper$onCreate$2;->this$0:Lexpo/modules/ReactActivityDelegateWrapper;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILn7/f;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ln7/f;)Ln7/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ln7/f;",
            ")",
            "Ln7/f;"
        }
    .end annotation

    .line 1
    new-instance p1, Lexpo/modules/ReactActivityDelegateWrapper$onCreate$2;

    .line 2
    .line 3
    iget-object v0, p0, Lexpo/modules/ReactActivityDelegateWrapper$onCreate$2;->this$0:Lexpo/modules/ReactActivityDelegateWrapper;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lexpo/modules/ReactActivityDelegateWrapper$onCreate$2;-><init>(Lexpo/modules/ReactActivityDelegateWrapper;Ln7/f;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(LR8/N;Ln7/f;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LR8/N;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lexpo/modules/ReactActivityDelegateWrapper$onCreate$2;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/ReactActivityDelegateWrapper$onCreate$2;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/ReactActivityDelegateWrapper$onCreate$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/ReactActivityDelegateWrapper$onCreate$2;->invoke(LR8/N;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lexpo/modules/ReactActivityDelegateWrapper$onCreate$2;->label:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto/16 :goto_2

    .line 19
    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lexpo/modules/ReactActivityDelegateWrapper$onCreate$2;->this$0:Lexpo/modules/ReactActivityDelegateWrapper;

    .line 36
    .line 37
    invoke-static {p1}, Lexpo/modules/ReactActivityDelegateWrapper;->access$getDelayLoadAppHandler(Lexpo/modules/ReactActivityDelegateWrapper;)Lexpo/modules/core/interfaces/ReactActivityHandler$DelayLoadAppHandler;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iput v3, p0, Lexpo/modules/ReactActivityDelegateWrapper$onCreate$2;->label:I

    .line 42
    .line 43
    invoke-static {p1, v1, p0}, Lexpo/modules/ReactActivityDelegateWrapper;->access$awaitDelayLoadAppWhenReady(Lexpo/modules/ReactActivityDelegateWrapper;Lexpo/modules/core/interfaces/ReactActivityHandler$DelayLoadAppHandler;Ln7/f;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-ne p1, v0, :cond_3

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    :goto_0
    iget-object p1, p0, Lexpo/modules/ReactActivityDelegateWrapper$onCreate$2;->this$0:Lexpo/modules/ReactActivityDelegateWrapper;

    .line 51
    .line 52
    invoke-static {p1}, Lexpo/modules/ReactActivityDelegateWrapper;->access$getLoadAppReady$p(Lexpo/modules/ReactActivityDelegateWrapper;)LR8/w;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    sget-object v1, Li7/B;->a:Li7/B;

    .line 57
    .line 58
    invoke-interface {p1, v1}, LR8/w;->l0(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 62
    .line 63
    const/16 v1, 0x1a

    .line 64
    .line 65
    if-lt p1, v1, :cond_4

    .line 66
    .line 67
    iget-object p1, p0, Lexpo/modules/ReactActivityDelegateWrapper$onCreate$2;->this$0:Lexpo/modules/ReactActivityDelegateWrapper;

    .line 68
    .line 69
    invoke-virtual {p1}, Lexpo/modules/ReactActivityDelegateWrapper;->isWideColorGamutEnabled()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_4

    .line 74
    .line 75
    iget-object p1, p0, Lexpo/modules/ReactActivityDelegateWrapper$onCreate$2;->this$0:Lexpo/modules/ReactActivityDelegateWrapper;

    .line 76
    .line 77
    invoke-static {p1}, Lexpo/modules/ReactActivityDelegateWrapper;->access$getActivity$p(Lexpo/modules/ReactActivityDelegateWrapper;)Lcom/facebook/react/ReactActivity;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-static {p1, v3}, Lcom/facebook/react/e;->a(Landroid/view/Window;I)V

    .line 86
    .line 87
    .line 88
    :cond_4
    iget-object p1, p0, Lexpo/modules/ReactActivityDelegateWrapper$onCreate$2;->this$0:Lexpo/modules/ReactActivityDelegateWrapper;

    .line 89
    .line 90
    invoke-virtual {p1}, Lexpo/modules/ReactActivityDelegateWrapper;->composeLaunchOptions()Landroid/os/Bundle;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    new-instance v1, Lcom/facebook/react/ReactDelegate;

    .line 95
    .line 96
    iget-object v4, p0, Lexpo/modules/ReactActivityDelegateWrapper$onCreate$2;->this$0:Lexpo/modules/ReactActivityDelegateWrapper;

    .line 97
    .line 98
    invoke-virtual {v4}, Lexpo/modules/ReactActivityDelegateWrapper;->getPlainActivity()Landroid/app/Activity;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    iget-object v5, p0, Lexpo/modules/ReactActivityDelegateWrapper$onCreate$2;->this$0:Lexpo/modules/ReactActivityDelegateWrapper;

    .line 103
    .line 104
    invoke-virtual {v5}, Lexpo/modules/ReactActivityDelegateWrapper;->getReactHost()Lcom/facebook/react/ReactHost;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    iget-object v6, p0, Lexpo/modules/ReactActivityDelegateWrapper$onCreate$2;->this$0:Lexpo/modules/ReactActivityDelegateWrapper;

    .line 109
    .line 110
    invoke-virtual {v6}, Lexpo/modules/ReactActivityDelegateWrapper;->getMainComponentName()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    invoke-direct {v1, v4, v5, v6, p1}, Lcom/facebook/react/ReactDelegate;-><init>(Landroid/app/Activity;Lcom/facebook/react/ReactHost;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 115
    .line 116
    .line 117
    const-class p1, Lcom/facebook/react/ReactActivityDelegate;

    .line 118
    .line 119
    const-string v4, "mReactDelegate"

    .line 120
    .line 121
    invoke-virtual {p1, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-virtual {p1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 126
    .line 127
    .line 128
    iget-object v3, p0, Lexpo/modules/ReactActivityDelegateWrapper$onCreate$2;->this$0:Lexpo/modules/ReactActivityDelegateWrapper;

    .line 129
    .line 130
    invoke-virtual {v3}, Lexpo/modules/ReactActivityDelegateWrapper;->getDelegate$expo_release()Lcom/facebook/react/ReactActivityDelegate;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    invoke-virtual {p1, v3, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    iget-object p1, p0, Lexpo/modules/ReactActivityDelegateWrapper$onCreate$2;->this$0:Lexpo/modules/ReactActivityDelegateWrapper;

    .line 138
    .line 139
    invoke-virtual {p1}, Lexpo/modules/ReactActivityDelegateWrapper;->getMainComponentName()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    if-eqz p1, :cond_5

    .line 144
    .line 145
    iget-object p1, p0, Lexpo/modules/ReactActivityDelegateWrapper$onCreate$2;->this$0:Lexpo/modules/ReactActivityDelegateWrapper;

    .line 146
    .line 147
    invoke-virtual {p1}, Lexpo/modules/ReactActivityDelegateWrapper;->getMainComponentName()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    iput v2, p0, Lexpo/modules/ReactActivityDelegateWrapper$onCreate$2;->label:I

    .line 152
    .line 153
    const/4 v2, 0x0

    .line 154
    invoke-static {p1, v1, v2, p0}, Lexpo/modules/ReactActivityDelegateWrapper;->access$loadAppImpl(Lexpo/modules/ReactActivityDelegateWrapper;Ljava/lang/String;ZLn7/f;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    if-ne p1, v0, :cond_5

    .line 159
    .line 160
    :goto_1
    return-object v0

    .line 161
    :cond_5
    :goto_2
    sget-object p1, Li7/B;->a:Li7/B;

    .line 162
    .line 163
    return-object p1
.end method
