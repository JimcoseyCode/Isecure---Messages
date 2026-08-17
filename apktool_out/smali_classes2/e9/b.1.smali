.class public interface abstract Le9/b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le9/b$a;
    }
.end annotation


# static fields
.field public static final a:Le9/b;

.field public static final b:Le9/b;

.field public static final c:Le9/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Le9/b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Le9/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Le9/b;->c:Le9/b$a;

    .line 8
    .line 9
    new-instance v0, Le9/b$a$a;

    .line 10
    .line 11
    invoke-direct {v0}, Le9/b$a$a;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Le9/b;->a:Le9/b;

    .line 15
    .line 16
    new-instance v0, Lg9/b;

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-direct {v0, v1, v2, v1}, Lg9/b;-><init>(Le9/q;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Le9/b;->b:Le9/b;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public abstract a(Le9/F;Le9/D;)Le9/B;
.end method
