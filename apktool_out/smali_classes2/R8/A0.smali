.class public interface abstract LR8/A0;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ln7/j$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LR8/A0$a;,
        LR8/A0$b;
    }
.end annotation


# static fields
.field public static final c:LR8/A0$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, LR8/A0$b;->g:LR8/A0$b;

    .line 2
    .line 3
    sput-object v0, LR8/A0;->c:LR8/A0$b;

    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public abstract A(LR8/v;)LR8/t;
.end method

.method public abstract J(ZZLkotlin/jvm/functions/Function1;)LR8/f0;
.end method

.method public abstract M()Ljava/util/concurrent/CancellationException;
.end method

.method public abstract d()Z
.end method

.method public abstract g0(Lkotlin/jvm/functions/Function1;)LR8/f0;
.end method

.method public abstract isCompleted()Z
.end method

.method public abstract k(Ljava/util/concurrent/CancellationException;)V
.end method

.method public abstract start()Z
.end method
