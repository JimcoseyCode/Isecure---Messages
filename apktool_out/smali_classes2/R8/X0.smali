.class public final LR8/X0;
.super Ljava/util/concurrent/CancellationException;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field public final transient g:LR8/A0;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, p1, v0}, LR8/X0;-><init>(Ljava/lang/String;LR8/A0;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LR8/A0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 2
    iput-object p2, p0, LR8/X0;->g:LR8/A0;

    return-void
.end method
