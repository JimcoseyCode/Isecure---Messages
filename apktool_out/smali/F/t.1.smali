.class public LF/t;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF/t$a;
    }
.end annotation


# instance fields
.field private final a:LF/t$a;


# direct methods
.method public constructor <init>(LF/t$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LF/t;->a:LF/t$a;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public b()LF/t$a;
    .locals 1

    .line 1
    iget-object v0, p0, LF/t;->a:LF/t$a;

    .line 2
    .line 3
    return-object v0
.end method
