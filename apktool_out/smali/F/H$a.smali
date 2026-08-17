.class final LF/H$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LF/E;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF/H;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field private final P:LF/A0;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, LF/A0;->a(Ljava/lang/Object;)LF/A0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, LF/H$a;->P:LF/A0;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public T()LF/A0;
    .locals 1

    .line 1
    iget-object v0, p0, LF/H$a;->P:LF/A0;

    .line 2
    .line 3
    return-object v0
.end method

.method public o()LF/j0;
    .locals 1

    .line 1
    invoke-static {}, LF/X0;->g0()LF/X0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
