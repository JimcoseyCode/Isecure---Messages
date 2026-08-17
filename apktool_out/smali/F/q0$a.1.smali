.class public final LF/q0$a;
.super Ljava/lang/Exception;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF/q0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field g:LF/q0;


# direct methods
.method public constructor <init>(Ljava/lang/String;LF/q0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LF/q0$a;->g:LF/q0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()LF/q0;
    .locals 1

    .line 1
    iget-object v0, p0, LF/q0$a;->g:LF/q0;

    .line 2
    .line 3
    return-object v0
.end method
