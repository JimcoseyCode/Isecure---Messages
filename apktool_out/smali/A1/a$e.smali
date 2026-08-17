.class public interface abstract LA1/a$e;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LA1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "e"
.end annotation


# static fields
.field public static final a:LA1/a$e;

.field public static final b:LA1/a$e;

.field public static final c:LA1/a$e;

.field public static final d:LA1/a$e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LA1/a$e$a;

    .line 2
    .line 3
    invoke-direct {v0}, LA1/a$e$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LA1/a$e;->a:LA1/a$e;

    .line 7
    .line 8
    new-instance v0, LA1/a$e$b;

    .line 9
    .line 10
    invoke-direct {v0}, LA1/a$e$b;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, LA1/a$e;->b:LA1/a$e;

    .line 14
    .line 15
    new-instance v1, LA1/a$e$c;

    .line 16
    .line 17
    invoke-direct {v1}, LA1/a$e$c;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v1, LA1/a$e;->c:LA1/a$e;

    .line 21
    .line 22
    sput-object v0, LA1/a$e;->d:LA1/a$e;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/Throwable;)V
.end method
