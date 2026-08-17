.class public LK/f$b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LK/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field a:LF/D1;

.field b:LF/D1;


# direct methods
.method constructor <init>(LF/D1;LF/D1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LK/f$b;->a:LF/D1;

    .line 5
    .line 6
    iput-object p2, p0, LK/f$b;->b:LF/D1;

    .line 7
    .line 8
    return-void
.end method
