.class public interface abstract LK/m;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK/m$b;
    }
.end annotation


# static fields
.field public static final a:LK/m$b;

.field public static final b:LK/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, LK/m$b;->a:LK/m$b;

    .line 2
    .line 3
    sput-object v0, LK/m;->a:LK/m$b;

    .line 4
    .line 5
    new-instance v0, LK/m$a;

    .line 6
    .line 7
    invoke-direct {v0}, LK/m$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, LK/m;->b:LK/m;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a(LF/J;)V
    .locals 1

    .line 1
    const-string v0, "cameraDeviceSurfaceManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public abstract b(ILF/L;Ljava/util/List;Ljava/util/List;LF/E;ILandroid/util/Range;ZZ)LK/l;
.end method
