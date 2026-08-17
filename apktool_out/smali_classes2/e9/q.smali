.class public interface abstract Le9/q;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le9/q$a;
    }
.end annotation


# static fields
.field public static final a:Le9/q;

.field public static final b:Le9/q$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Le9/q$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Le9/q$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Le9/q;->b:Le9/q$a;

    .line 8
    .line 9
    new-instance v0, Le9/q$a$a;

    .line 10
    .line 11
    invoke-direct {v0}, Le9/q$a$a;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Le9/q;->a:Le9/q;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;)Ljava/util/List;
.end method
