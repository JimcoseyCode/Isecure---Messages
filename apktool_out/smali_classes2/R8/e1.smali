.class public final LR8/e1;
.super Ln7/a;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LR8/e1$a;
    }
.end annotation


# static fields
.field public static final i:LR8/e1$a;


# instance fields
.field public h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LR8/e1$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LR8/e1$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LR8/e1;->i:LR8/e1$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, LR8/e1;->i:LR8/e1$a;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Ln7/a;-><init>(Ln7/j$c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
