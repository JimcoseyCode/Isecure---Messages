.class public final LJ7/f$d;
.super LJ7/f;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ7/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final e:LJ7/f$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LJ7/f$d;

    .line 2
    .line 3
    invoke-direct {v0}, LJ7/f$d;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LJ7/f$d;->e:LJ7/f$d;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .line 1
    sget-object v0, LI7/o;->s:Lk8/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const-string v3, "SuspendFunction"

    .line 6
    .line 7
    invoke-direct {p0, v0, v3, v1, v2}, LJ7/f;-><init>(Lk8/c;Ljava/lang/String;ZLk8/b;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
